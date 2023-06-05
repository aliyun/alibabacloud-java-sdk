// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDoubleVerificationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<AddDoubleVerificationGroupsResponseBodyResultList> resultList;

    public static AddDoubleVerificationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDoubleVerificationGroupsResponseBody self = new AddDoubleVerificationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDoubleVerificationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDoubleVerificationGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddDoubleVerificationGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDoubleVerificationGroupsResponseBody setResultList(java.util.List<AddDoubleVerificationGroupsResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<AddDoubleVerificationGroupsResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class AddDoubleVerificationGroupsResponseBodyResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Message")
        public String message;

        public static AddDoubleVerificationGroupsResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            AddDoubleVerificationGroupsResponseBodyResultList self = new AddDoubleVerificationGroupsResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public AddDoubleVerificationGroupsResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddDoubleVerificationGroupsResponseBodyResultList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public AddDoubleVerificationGroupsResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
