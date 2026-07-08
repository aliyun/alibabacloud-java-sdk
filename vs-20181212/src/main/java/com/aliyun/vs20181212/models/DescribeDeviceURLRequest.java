// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceURLRequest extends TeaModel {
    @NameInMap("Auth")
    public Boolean auth;

    /**
     * <p>Authentication validity period, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>Device ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>348*****380-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Stream mode. Valid values:</p>
     * <ul>
     * <li><p>play</p>
     * </li>
     * <li><p>push</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>push</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Stream protocol. Valid values:</p>
     * <ul>
     * <li><p>rtmp</p>
     * </li>
     * <li><p>flv</p>
     * </li>
     * <li><p>hls</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When Mode is set to push, only rtmp is supported.</p>
     * </blockquote>
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
     * <p>Stream name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live001</p>
     */
    @NameInMap("Stream")
    public String stream;

    @NameInMap("Type")
    public String type;

    public static DescribeDeviceURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceURLRequest self = new DescribeDeviceURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceURLRequest setAuth(Boolean auth) {
        this.auth = auth;
        return this;
    }
    public Boolean getAuth() {
        return this.auth;
    }

    public DescribeDeviceURLRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeDeviceURLRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDeviceURLRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeDeviceURLRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeDeviceURLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDeviceURLRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public DescribeDeviceURLRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
