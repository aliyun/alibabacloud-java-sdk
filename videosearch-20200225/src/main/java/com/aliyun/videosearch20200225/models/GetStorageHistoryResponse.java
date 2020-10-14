// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetStorageHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetStorageHistoryResponseData data;

    public static GetStorageHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageHistoryResponse self = new GetStorageHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStorageHistoryResponse setData(GetStorageHistoryResponseData data) {
        this.data = data;
        return this;
    }
    public GetStorageHistoryResponseData getData() {
        return this.data;
    }

    public static class GetStorageHistoryResponseDataList extends TeaModel {
        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

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

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static GetStorageHistoryResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetStorageHistoryResponseDataList self = new GetStorageHistoryResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetStorageHistoryResponseDataList setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public GetStorageHistoryResponseDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStorageHistoryResponseDataList setStorageType(Integer storageType) {
            this.storageType = storageType;
            return this;
        }
        public Integer getStorageType() {
            return this.storageType;
        }

        public GetStorageHistoryResponseDataList setStorageInfo(Integer storageInfo) {
            this.storageInfo = storageInfo;
            return this;
        }
        public Integer getStorageInfo() {
            return this.storageInfo;
        }

        public GetStorageHistoryResponseDataList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetStorageHistoryResponseDataList setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetStorageHistoryResponseData extends TeaModel {
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
        public java.util.List<GetStorageHistoryResponseDataList> list;

        public static GetStorageHistoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetStorageHistoryResponseData self = new GetStorageHistoryResponseData();
            return TeaModel.build(map, self);
        }

        public GetStorageHistoryResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetStorageHistoryResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetStorageHistoryResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetStorageHistoryResponseData setList(java.util.List<GetStorageHistoryResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetStorageHistoryResponseDataList> getList() {
            return this.list;
        }

    }

}
