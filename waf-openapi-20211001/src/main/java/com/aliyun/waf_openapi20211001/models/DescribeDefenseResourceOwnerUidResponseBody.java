// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceOwnerUidResponseBody extends TeaModel {
    @NameInMap("OwnerInfos")
    public java.util.List<DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos> ownerInfos;

    /**
     * <strong>example:</strong>
     * <p>7326952B-B83B-5B7C-84FA-77F3E17310A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefenseResourceOwnerUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceOwnerUidResponseBody self = new DescribeDefenseResourceOwnerUidResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceOwnerUidResponseBody setOwnerInfos(java.util.List<DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos> ownerInfos) {
        this.ownerInfos = ownerInfos;
        return this;
    }
    public java.util.List<DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos> getOwnerInfos() {
        return this.ownerInfos;
    }

    public DescribeDefenseResourceOwnerUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>125************21</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>a.com-waf</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos self = new DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeDefenseResourceOwnerUidResponseBodyOwnerInfos setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
