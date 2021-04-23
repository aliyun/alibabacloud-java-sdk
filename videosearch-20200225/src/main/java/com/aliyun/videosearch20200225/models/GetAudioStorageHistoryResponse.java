// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetAudioStorageHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAudioStorageHistoryResponseData data;

    public static GetAudioStorageHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAudioStorageHistoryResponse self = new GetAudioStorageHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAudioStorageHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioStorageHistoryResponse setData(GetAudioStorageHistoryResponseData data) {
        this.data = data;
        return this;
    }
    public GetAudioStorageHistoryResponseData getData() {
        return this.data;
    }

    public static class GetAudioStorageHistoryResponseDataList extends TeaModel {
        @NameInMap("AudioId")
        @Validation(required = true)
        public String audioId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("StorageType")
        @Validation(required = true)
        public Integer storageType;

        @NameInMap("StorageInfo")
        @Validation(required = true)
        public Integer storageInfo;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("AudioUrl")
        @Validation(required = true)
        public String audioUrl;

        public static GetAudioStorageHistoryResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAudioStorageHistoryResponseDataList self = new GetAudioStorageHistoryResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetAudioStorageHistoryResponseDataList setAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }
        public String getAudioId() {
            return this.audioId;
        }

        public GetAudioStorageHistoryResponseDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAudioStorageHistoryResponseDataList setStorageType(Integer storageType) {
            this.storageType = storageType;
            return this;
        }
        public Integer getStorageType() {
            return this.storageType;
        }

        public GetAudioStorageHistoryResponseDataList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public GetAudioStorageHistoryResponseDataList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetAudioStorageHistoryResponseDataList setAudioUrl(String audioUrl) {
            this.audioUrl = audioUrl;
            return this;
        }
        public String getAudioUrl() {
            return this.audioUrl;
        }

    }

    public static class GetAudioStorageHistoryResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<GetAudioStorageHistoryResponseDataList> list;

        public static GetAudioStorageHistoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioStorageHistoryResponseData self = new GetAudioStorageHistoryResponseData();
            return TeaModel.build(map, self);
        }

        public GetAudioStorageHistoryResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetAudioStorageHistoryResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAudioStorageHistoryResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetAudioStorageHistoryResponseData setList(java.util.List<GetAudioStorageHistoryResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAudioStorageHistoryResponseDataList> getList() {
            return this.list;
        }

    }

}
