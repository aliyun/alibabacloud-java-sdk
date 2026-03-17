// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiGroupsResponseBody extends TeaModel {
    /**
     * <p>The information about the application group.</p>
     */
    @NameInMap("DpiGroup")
    public java.util.List<ListDpiGroupsResponseBodyDpiGroup> dpiGroup;

    /**
     * <p>The token returned for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFPSpX59Ebw****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC184A86-3C93-49D6-BB34-6C193E14D37F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
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
        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DpiGroupId")
        public String dpiGroupId;

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>P2P</p>
         */
        @NameInMap("DpiGroupName")
        public String dpiGroupName;

        /**
         * <p>The earliest version of engine that supports the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>0-0.0.1</p>
         */
        @NameInMap("MinEngineVersion")
        public String minEngineVersion;

        /**
         * <p>The earliest version of signature database that supports the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>20201117_1_0-0.0.1</p>
         */
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
