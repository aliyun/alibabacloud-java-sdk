// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the global IP whitelist template.</p>
     */
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalSecurityIPGroupResponseBody self = new DeleteGlobalSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalSecurityIPGroupResponseBody setGlobalSecurityIPGroup(java.util.List<DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup) {
        this.globalSecurityIPGroup = globalSecurityIPGroup;
        return this;
    }
    public java.util.List<DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    public DeleteGlobalSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup extends TeaModel {
        /**
         * <p>The clusters that are associated with the IP address whitelist template.</p>
         */
        @NameInMap("DBInstances")
        public java.util.List<String> DBInstances;

        /**
         * <p>The IP address in the whitelist template.</p>
         * <blockquote>
         * <p> Multiple IP addresses are separated by commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP whitelists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the global IP whitelist template. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The name must start with a letter and end with a letter or a digit.</li>
         * <li>The name must be 2 to 120 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the global IP whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>g-zsldxfiwjmti0kcm****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup self = new DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setDBInstances(java.util.List<String> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<String> getDBInstances() {
            return this.DBInstances;
        }

        public DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DeleteGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
