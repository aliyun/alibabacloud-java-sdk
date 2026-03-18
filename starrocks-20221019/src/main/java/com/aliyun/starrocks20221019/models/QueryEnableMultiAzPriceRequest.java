// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryEnableMultiAzPriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-8dsy12g*****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("observers")
    public java.util.List<QueryEnableMultiAzPriceRequestObservers> observers;

    /**
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("promotionOptionNo")
    public String promotionOptionNo;

    public static QueryEnableMultiAzPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnableMultiAzPriceRequest self = new QueryEnableMultiAzPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnableMultiAzPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEnableMultiAzPriceRequest setObservers(java.util.List<QueryEnableMultiAzPriceRequestObservers> observers) {
        this.observers = observers;
        return this;
    }
    public java.util.List<QueryEnableMultiAzPriceRequestObservers> getObservers() {
        return this.observers;
    }

    public QueryEnableMultiAzPriceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public static class QueryEnableMultiAzPriceRequestObservers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-9sdur12t27s</p>
         */
        @NameInMap("vswId")
        public String vswId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-h</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static QueryEnableMultiAzPriceRequestObservers build(java.util.Map<String, ?> map) throws Exception {
            QueryEnableMultiAzPriceRequestObservers self = new QueryEnableMultiAzPriceRequestObservers();
            return TeaModel.build(map, self);
        }

        public QueryEnableMultiAzPriceRequestObservers setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public QueryEnableMultiAzPriceRequestObservers setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
