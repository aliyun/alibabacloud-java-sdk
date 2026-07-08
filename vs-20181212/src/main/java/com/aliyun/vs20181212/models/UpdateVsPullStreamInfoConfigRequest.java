// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateVsPullStreamInfoConfigRequest extends TeaModel {
    @NameInMap("Always")
    public String always;

    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Your stream pulling domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of stream pulling.</p>
     * <blockquote>
     * <p>UTC time format. The interval between StartTime and EndTime must be within 7 days, and EndTime must be later than the current time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-12-10T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The origin server of your live stream.</p>
     * <blockquote>
     * <p>Supports multiple values, separated by English semicolons (;).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>up.xxx.com.cn</p>
     */
    @NameInMap("SourceUrl")
    public String sourceUrl;

    /**
     * <p>The start time of stream pulling.</p>
     * <blockquote>
     * <p>UTC time format. The interval between StartTime and EndTime must be within 7 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-12-10T10:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the live stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxStream</p>
     */
    @NameInMap("StreamName")
    public String streamName;

    public static UpdateVsPullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVsPullStreamInfoConfigRequest self = new UpdateVsPullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVsPullStreamInfoConfigRequest setAlways(String always) {
        this.always = always;
        return this;
    }
    public String getAlways() {
        return this.always;
    }

    public UpdateVsPullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateVsPullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateVsPullStreamInfoConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateVsPullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateVsPullStreamInfoConfigRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public UpdateVsPullStreamInfoConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateVsPullStreamInfoConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
