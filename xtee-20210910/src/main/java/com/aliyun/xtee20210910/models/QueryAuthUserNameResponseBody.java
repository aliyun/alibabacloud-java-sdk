// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthUserNameResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public QueryAuthUserNameResponseBodyResultObject resultObject;

    public static QueryAuthUserNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthUserNameResponseBody self = new QueryAuthUserNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthUserNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthUserNameResponseBody setResultObject(QueryAuthUserNameResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public QueryAuthUserNameResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class QueryAuthUserNameResponseBodyResultObject extends TeaModel {
        @NameInMap("company")
        public String company;

        @NameInMap("userId")
        public Long userId;

        public static QueryAuthUserNameResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthUserNameResponseBodyResultObject self = new QueryAuthUserNameResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryAuthUserNameResponseBodyResultObject setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public QueryAuthUserNameResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
