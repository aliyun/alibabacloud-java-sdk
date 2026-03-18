// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class EnableMultiAzRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-238sjh237s12***</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("observers")
    public java.util.List<EnableMultiAzRequestObservers> observers;

    /**
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("promotionOptionNo")
    public String promotionOptionNo;

    public static EnableMultiAzRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMultiAzRequest self = new EnableMultiAzRequest();
        return TeaModel.build(map, self);
    }

    public EnableMultiAzRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableMultiAzRequest setObservers(java.util.List<EnableMultiAzRequestObservers> observers) {
        this.observers = observers;
        return this;
    }
    public java.util.List<EnableMultiAzRequestObservers> getObservers() {
        return this.observers;
    }

    public EnableMultiAzRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public static class EnableMultiAzRequestObservers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-x1232js012</p>
         */
        @NameInMap("vswId")
        public String vswId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static EnableMultiAzRequestObservers build(java.util.Map<String, ?> map) throws Exception {
            EnableMultiAzRequestObservers self = new EnableMultiAzRequestObservers();
            return TeaModel.build(map, self);
        }

        public EnableMultiAzRequestObservers setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public EnableMultiAzRequestObservers setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
