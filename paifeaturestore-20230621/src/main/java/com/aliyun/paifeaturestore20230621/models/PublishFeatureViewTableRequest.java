// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class PublishFeatureViewTableRequest extends TeaModel {
    /**
     * <p>Custom configurations for the task, provided as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The event time of the data to be published, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("EventTime")
    public String eventTime;

    /**
     * <p>The synchronization mode. The following values are supported:</p>
     * <ul>
     * <li><p><code>Overwrite</code>: Overwrites all data in the specified partitions.</p>
     * </li>
     * <li><p><code>Merge</code>: Merges the new data with existing data in the specified partitions.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Overwrite</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Specifies whether to synchronize data from the offline table to the online store.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OfflineToOnline")
    public Boolean offlineToOnline;

    /**
     * <p>The partitions to publish.</p>
     */
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
