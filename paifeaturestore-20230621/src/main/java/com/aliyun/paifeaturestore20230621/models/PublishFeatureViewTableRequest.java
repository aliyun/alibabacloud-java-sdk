// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class PublishFeatureViewTableRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("EventTime")
    public String eventTime;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OfflineToOnline")
    public Boolean offlineToOnline;

    @NameInMap("Partitions")
    public java.util.Map<String, java.util.Map<String, ?>> partitions;

    public static PublishFeatureViewTableRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFeatureViewTableRequest self = new PublishFeatureViewTableRequest();
        return TeaModel.build(map, self);
    }

    public PublishFeatureViewTableRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public PublishFeatureViewTableRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public PublishFeatureViewTableRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PublishFeatureViewTableRequest setOfflineToOnline(Boolean offlineToOnline) {
        this.offlineToOnline = offlineToOnline;
        return this;
    }
    public Boolean getOfflineToOnline() {
        return this.offlineToOnline;
    }

    public PublishFeatureViewTableRequest setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
        return this.partitions;
    }

}
