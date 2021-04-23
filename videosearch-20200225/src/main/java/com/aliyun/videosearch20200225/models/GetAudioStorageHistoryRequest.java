// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetAudioStorageHistoryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("AudioId")
    @Validation(required = true)
    public String audioId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetAudioStorageHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioStorageHistoryRequest self = new GetAudioStorageHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioStorageHistoryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetAudioStorageHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAudioStorageHistoryRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public GetAudioStorageHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAudioStorageHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
