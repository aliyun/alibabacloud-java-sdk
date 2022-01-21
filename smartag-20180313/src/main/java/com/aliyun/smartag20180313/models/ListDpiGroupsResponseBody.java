// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiGroupsResponseBody extends TeaModel {
    @NameInMap("DpiGroup")
    public java.util.List<ListDpiGroupsResponseBodyDpiGroup> dpiGroup;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDpiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDpiGroupsResponseBody self = new ListDpiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDpiGroupsResponseBody setDpiGroup(java.util.List<ListDpiGroupsResponseBodyDpiGroup> dpiGroup) {
        this.dpiGroup = dpiGroup;
        return this;
    }
    public java.util.List<ListDpiGroupsResponseBodyDpiGroup> getDpiGroup() {
        return this.dpiGroup;
    }

    public ListDpiGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDpiGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDpiGroupsResponseBodyDpiGroup extends TeaModel {
        @NameInMap("DpiGroupId")
        public String dpiGroupId;

        @NameInMap("DpiGroupName")
        public String dpiGroupName;

        @NameInMap("MinEngineVersion")
        public String minEngineVersion;

        @NameInMap("MinSignatureDbVersion")
        public String minSignatureDbVersion;

        public static ListDpiGroupsResponseBodyDpiGroup build(java.util.Map<String, ?> map) throws Exception {
            ListDpiGroupsResponseBodyDpiGroup self = new ListDpiGroupsResponseBodyDpiGroup();
            return TeaModel.build(map, self);
        }

        public ListDpiGroupsResponseBodyDpiGroup setDpiGroupId(String dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public String getDpiGroupId() {
            return this.dpiGroupId;
        }

        public ListDpiGroupsResponseBodyDpiGroup setDpiGroupName(String dpiGroupName) {
            this.dpiGroupName = dpiGroupName;
            return this;
        }
        public String getDpiGroupName() {
            return this.dpiGroupName;
        }

        public ListDpiGroupsResponseBodyDpiGroup setMinEngineVersion(String minEngineVersion) {
            this.minEngineVersion = minEngineVersion;
            return this;
        }
        public String getMinEngineVersion() {
            return this.minEngineVersion;
        }

        public ListDpiGroupsResponseBodyDpiGroup setMinSignatureDbVersion(String minSignatureDbVersion) {
            this.minSignatureDbVersion = minSignatureDbVersion;
            return this;
        }
        public String getMinSignatureDbVersion() {
            return this.minSignatureDbVersion;
        }

    }

}
