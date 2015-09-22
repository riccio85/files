/*
 * Copyright 2014-2015 Project Chronos and Pramantha Ltd
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package uk.projectchronos.xplorationreader.utils;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dexafree.materialList.card.*;
import com.dexafree.materialList.card.provider.CardProvider;
import butterknife.Bind;
import butterknife.ButterKnife;
import uk.projectchronos.xplorationreader.R;

/**
 *
 */
public class ArticleCardProvider extends CardProvider<ArticleCardProvider> {

    // private Bitmap image;
    @Bind(R.id.image)
    ImageView img;

    int hardcode; // To do see the image format and fix code

    private String strTitle;
    @Bind(R.id.title)
    TextView title;

    private String strPublished;
    @Bind(R.id.published) TextView published;

    private String strIntro;
    @Bind(R.id.intro) TextView intro;

    @Override
    public int getLayout() {
        return R.layout.article_card;
    }


    // public ArticleCardProvider setText(Bitmap img){
    public ArticleCardProvider setImage(int hardcode){ // To do see the image format and fix code
        //  this.image=img;
        this.hardcode=hardcode; // To do see the image format and fix code
        notifyDataSetChanged();
        return this;
    }


    public ArticleCardProvider setTextTitle(String title){
        this.strTitle=title;
        notifyDataSetChanged();
        return this;
    }
    public ArticleCardProvider setTextPublished(String published){
        this.strPublished=published;
        notifyDataSetChanged();
        return this;
    }

    public ArticleCardProvider setTextIntro(String intro){
        this.strIntro= intro;
        notifyDataSetChanged();
        return this;
    }

    @Override
    public void render(@NonNull View view, @NonNull Card card) {
        super.render(view, card);
        ButterKnife.bind(this, view);
        img.setImageResource(R.mipmap.ic_launcher);
        title.setText(strTitle);
        published.setText(strPublished);
        intro.setText(strIntro);
    }




}
