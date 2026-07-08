// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamURLRequest extends TeaModel {
    /**
     * <p>Specifies whether to generate a signed URL. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Auth")
    public Boolean auth;

    /**
     * <p>The primary key associated with the playback domain name. This key is used to generate the authentication URL.</p>
     * <blockquote>
     * <p>Call the <a href="https://next.api.aliyun.com/document/vs/2018-12-12/DescribeVsDomainConfigs">DescribeVsDomainConfigs</a> operation to query the \<code>AuthKey\\</code> information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ocs*****ace</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The end time. This parameter applies to \<code>vod\\</code> streams.<br>
     * A UNIX timestamp. Unit: seconds.<br></p>
     * 
     * <strong>example:</strong>
     * <p>1571649499</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time-to-live (TTL) of the URL. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>The stream ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****997-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The playback protocol for the stream. Valid values:</p>
     * <ul>
     * <li><p>rtmp</p>
     * </li>
     * <li><p>flv</p>
     * </li>
     * <li><p>hls</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time. This parameter applies to \<code>vod\\</code> streams.<br>
     * A UNIX timestamp. Unit: seconds.<br></p>
     * 
     * <strong>example:</strong>
     * <p>1571639499</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The name of the transcoding rule. This parameter is valid only after a transcoding template is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>sd</p>
     */
    @NameInMap("Transcode")
    public String transcode;

    /**
     * <p>The type of the stream. The default value is \<code>live\\</code>. Valid values:</p>
     * <ul>
     * <li><p>\<code>live\\</code>: a live stream.</p>
     * </li>
     * <li><p>\<code>vod\\</code>: a video-on-demand (VOD) stream, such as a historical stream from a Network Video Recorder (NVR).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeStreamURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamURLRequest self = new DescribeStreamURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStreamURLRequest setAuth(Boolean auth) {
        this.auth = auth;
        return this;
    }
    public Boolean getAuth() {
        return this.auth;
    }

    public DescribeStreamURLRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public DescribeStreamURLRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeStreamURLRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeStreamURLRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeStreamURLRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeStreamURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeStreamURLRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeStreamURLRequest setTranscode(String transcode) {
        this.transcode = transcode;
        return this;
    }
    public String getTranscode() {
        return this.transcode;
    }

    public DescribeStreamURLRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
