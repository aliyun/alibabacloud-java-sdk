// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskLevelsRequest extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<ListInstanceRiskLevelsRequestInstanceList> instanceList;

    public static ListInstanceRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskLevelsRequest self = new ListInstanceRiskLevelsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskLevelsRequest setInstanceList(java.util.List<ListInstanceRiskLevelsRequestInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<ListInstanceRiskLevelsRequestInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static class ListInstanceRiskLevelsRequestInstanceList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The serial number of the instance.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListInstanceRiskLevelsRequestInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskLevelsRequestInstanceList self = new ListInstanceRiskLevelsRequestInstanceList();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskLevelsRequestInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceRiskLevelsRequestInstanceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
