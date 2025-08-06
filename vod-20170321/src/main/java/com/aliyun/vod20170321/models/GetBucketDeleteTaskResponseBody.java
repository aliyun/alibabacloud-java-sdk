// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetBucketDeleteTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public GetBucketDeleteTaskResponseBodyTaskInfo taskInfo;

    public static GetBucketDeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketDeleteTaskResponseBody self = new GetBucketDeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketDeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBucketDeleteTaskResponseBody setTaskInfo(GetBucketDeleteTaskResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetBucketDeleteTaskResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetBucketDeleteTaskResponseBodyTaskInfo extends TeaModel {
        @NameInMap("AttachedMediaRemain")
        public Long attachedMediaRemain;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeleteFiles")
        public Boolean deleteFiles;

        @NameInMap("ImageRemain")
        public Long imageRemain;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("VideoRemain")
        public Long videoRemain;

        public static GetBucketDeleteTaskResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBucketDeleteTaskResponseBodyTaskInfo self = new GetBucketDeleteTaskResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setAttachedMediaRemain(Long attachedMediaRemain) {
            this.attachedMediaRemain = attachedMediaRemain;
            return this;
        }
        public Long getAttachedMediaRemain() {
            return this.attachedMediaRemain;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setDeleteFiles(Boolean deleteFiles) {
            this.deleteFiles = deleteFiles;
            return this;
        }
        public Boolean getDeleteFiles() {
            return this.deleteFiles;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setImageRemain(Long imageRemain) {
            this.imageRemain = imageRemain;
            return this;
        }
        public Long getImageRemain() {
            return this.imageRemain;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public GetBucketDeleteTaskResponseBodyTaskInfo setVideoRemain(Long videoRemain) {
            this.videoRemain = videoRemain;
            return this;
        }
        public Long getVideoRemain() {
            return this.videoRemain;
        }

    }

}
