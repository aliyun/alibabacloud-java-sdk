// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class BatchGetMediasRequest extends TeaModel {
    /**
     * <p>The validity period of the signed file access URL. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("BizConfig")
    public String bizConfig;

    /**
     * <p>The IDs of the media assets to query, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("ReturnDynamicMeta")
    public Boolean returnDynamicMeta;

    public static BatchGetMediasRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediasRequest self = new BatchGetMediasRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetMediasRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public BatchGetMediasRequest setBizConfig(String bizConfig) {
        this.bizConfig = bizConfig;
        return this;
    }
    public String getBizConfig() {
        return this.bizConfig;
    }

    public BatchGetMediasRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public BatchGetMediasRequest setReturnDynamicMeta(Boolean returnDynamicMeta) {
        this.returnDynamicMeta = returnDynamicMeta;
        return this;
    }
    public Boolean getReturnDynamicMeta() {
        return this.returnDynamicMeta;
    }

}
