/**
 * Copyright 2017 Stephen Powis https://github.com/Crim/pardot-java-client
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.darksci.pardot.api.response.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * Represents the result from a User Query API call.
 */
public class UserQueryResponse {
    private UserQueryResponse.Result result;

    public Result getResult() {
        return result;
    }

    /**
     * Represents one or more Users.
     */
    public static class Result {
        private Integer totalResults = 0;

        @JacksonXmlProperty(localName = "user")
        private List<User> users;

        public Integer getTotalResults() {
            return totalResults;
        }

        public List<User> getUsers() {
            return users;
        }

        @Override
        public String toString() {
            return "UserQueryResponse{"
                + "totalResults=" + totalResults
                + ", users=" + users
                + '}';
        }
    }

    @Override
    public String toString() {
        return "UserQueryResponse{"
            + "result=" + result
            + '}';
    }
}
