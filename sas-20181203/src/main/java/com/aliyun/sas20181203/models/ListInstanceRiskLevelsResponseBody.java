// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskLevelsResponseBody extends TeaModel {
    /**
     * <p>The risk levels of instances.</p>
     */
    @NameInMap("InstanceRiskLevels")
    public java.util.List<ListInstanceRiskLevelsResponseBodyInstanceRiskLevels> instanceRiskLevels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceRiskLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskLevelsResponseBody self = new ListInstanceRiskLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskLevelsResponseBody setInstanceRiskLevels(java.util.List<ListInstanceRiskLevelsResponseBodyInstanceRiskLevels> instanceRiskLevels) {
        this.instanceRiskLevels = instanceRiskLevels;
        return this;
    }
    public java.util.List<ListInstanceRiskLevelsResponseBodyInstanceRiskLevels> getInstanceRiskLevels() {
        return this.instanceRiskLevels;
    }

    public ListInstanceRiskLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceRiskLevelsResponseBodyInstanceRiskLevels extends TeaModel {
        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5efigezp50l2cmb****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * <li><strong>none</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The UUID of the server for which you want to modify the defense rule. You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>f2d6e901-1004-4ca8-9dae-53ec04a92765</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListInstanceRiskLevelsResponseBodyInstanceRiskLevels build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskLevelsResponseBodyInstanceRiskLevels self = new ListInstanceRiskLevelsResponseBodyInstanceRiskLevels();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskLevelsResponseBodyInstanceRiskLevels setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceRiskLevelsResponseBodyInstanceRiskLevels setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListInstanceRiskLevelsResponseBodyInstanceRiskLevels setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
