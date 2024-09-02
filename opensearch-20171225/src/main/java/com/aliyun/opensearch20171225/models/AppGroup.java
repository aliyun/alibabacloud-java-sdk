// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class AppGroup extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("description")
    public String description;

    @NameInMap("domain")
    public String domain;

    @NameInMap("name")
    public String name;

    @NameInMap("order")
    public AppGroupOrder order;

    @NameInMap("quota")
    public Quota quota;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("type")
    public String type;

    public static AppGroup build(java.util.Map<String, ?> map) throws Exception {
        AppGroup self = new AppGroup();
        return TeaModel.build(map, self);
    }

    public AppGroup setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public AppGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppGroup setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AppGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppGroup setOrder(AppGroupOrder order) {
        this.order = order;
        return this;
    }
    public AppGroupOrder getOrder() {
        return this.order;
    }

    public AppGroup setQuota(Quota quota) {
        this.quota = quota;
        return this;
    }
    public Quota getQuota() {
        return this.quota;
    }

    public AppGroup setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AppGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AppGroupOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("pricingCycle")
        public String pricingCycle;

        public static AppGroupOrder build(java.util.Map<String, ?> map) throws Exception {
            AppGroupOrder self = new AppGroupOrder();
            return TeaModel.build(map, self);
        }

        public AppGroupOrder setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public AppGroupOrder setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public AppGroupOrder setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

}
