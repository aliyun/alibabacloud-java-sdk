// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskNumRequest extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<ListInstanceRiskNumRequestInstanceList> instanceList;

    public static ListInstanceRiskNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskNumRequest self = new ListInstanceRiskNumRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskNumRequest setInstanceList(java.util.List<ListInstanceRiskNumRequestInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListInstanceRiskNumRequestInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class ListInstanceRiskNumRequestInstanceList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9fdluqx20mp2x7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>f2d6e901-1004-4ca8-9dae-53ec04a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListInstanceRiskNumRequestInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskNumRequestInstanceList self = new ListInstanceRiskNumRequestInstanceList();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskNumRequestInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceRiskNumRequestInstanceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
