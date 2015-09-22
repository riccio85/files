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

package uk.projectchronos.xplorationreader.model;

/**
 * Class that represent a keyword.
 */
public class Keyword {

    /**
     * The keyword value itself.
     */
    private String keyword;

    /**
     * Gets the keyword's value.
     *
     * @return keyword value.
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the keyword value.
     *
     * @param keyword the string to set.
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "keyword='" + keyword + '\'' +
                '}';
    }
}