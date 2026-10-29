// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchForbidVsStreamRequest extends TeaModel {
    /**
     * <p>The stream name.</p>
     * <blockquote>
     * <ul>
     * <li>Format: AppName/StreamName.</li>
     * <li>You can specify multiple stream names separated by commas (,).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live/stream1,live/stream2</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The stream control action. Set the value to forbid, which indicates that stream push is forbidden.</p>
     * 
     * <strong>example:</strong>
     * <p>forbid</p>
     */
    @NameInMap("ControlStreamAction")
    public String controlStreamAction;

    /**
     * <p>The accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether the stream is pushed by the streamer or pulled by the client. Valid values:</p>
     * <ul>
     * <li>publisher: The stream is pushed by the streamer.</li>
     * </ul>
     * <blockquote>
     * <p>Currently, only publisher is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>publisher</p>
     */
    @NameInMap("LiveStreamType")
    public String liveStreamType;

    /**
     * <p>Specifies whether to only interrupt the stream without adding it to the blacklist. Valid values:</p>
     * <ul>
     * <li>yes</li>
     * <li>no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Oneshot")
    public String oneshot;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The time to resume the stream.</p>
     * <blockquote>
     * <p>Specify the time in UTC format, for example, 2015-12-01T17:37:00Z.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-12-01T17:37:00Z</p>
     */
    @NameInMap("ResumeTime")
    public String resumeTime;

    public static BatchForbidVsStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchForbidVsStreamRequest self = new BatchForbidVsStreamRequest();
        return TeaModel.build(map, self);
    }

    public BatchForbidVsStreamRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public BatchForbidVsStreamRequest setControlStreamAction(String controlStreamAction) {
        this.controlStreamAction = controlStreamAction;
        return this;
    }
    public String getControlStreamAction() {
        return this.controlStreamAction;
    }

    public BatchForbidVsStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchForbidVsStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public BatchForbidVsStreamRequest setOneshot(String oneshot) {
        this.oneshot = oneshot;
        return this;
    }
    public String getOneshot() {
        return this.oneshot;
    }

    public BatchForbidVsStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchForbidVsStreamRequest setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
        return this;
    }
    public String getResumeTime() {
        return this.resumeTime;
    }

}
