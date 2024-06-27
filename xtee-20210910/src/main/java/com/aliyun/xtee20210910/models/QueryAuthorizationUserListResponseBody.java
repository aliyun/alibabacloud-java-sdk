// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class QueryAuthorizationUserListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<QueryAuthorizationUserListResponseBodyResultObject> resultObject;

    public static QueryAuthorizationUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthorizationUserListResponseBody self = new QueryAuthorizationUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthorizationUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthorizationUserListResponseBody setResultObject(java.util.List<QueryAuthorizationUserListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<QueryAuthorizationUserListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class QueryAuthorizationUserListResponseBodyResultObject extends TeaModel {
        @NameInMap("company")
        public String company;

        @NameInMap("id")
        public Long id;

        @NameInMap("uid")
        public String uid;

        @NameInMap("userId")
        public Long userId;

        public static QueryAuthorizationUserListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthorizationUserListResponseBodyResultObject self = new QueryAuthorizationUserListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryAuthorizationUserListResponseBodyResultObject setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public QueryAuthorizationUserListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAuthorizationUserListResponseBodyResultObject setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryAuthorizationUserListResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
