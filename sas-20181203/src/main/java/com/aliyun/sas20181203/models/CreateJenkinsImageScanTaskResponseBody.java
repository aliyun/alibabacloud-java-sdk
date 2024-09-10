// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateJenkinsImageScanTaskResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateJenkinsImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageScanTaskResponseBody self = new CreateJenkinsImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageScanTaskResponseBody setData(CreateJenkinsImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateJenkinsImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateJenkinsImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateJenkinsImageScanTaskResponseBodyData extends TeaModel {
        /**
         * <p>The quota for image scan.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-upze3gcopm9c****</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The instance ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-0gkaatghnmnt****</p>
         */
        @NameInMap("RepoInstanceId")
        public String repoInstanceId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RepoRegionId")
        public String repoRegionId;

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The UUID of the image asset.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static CreateJenkinsImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateJenkinsImageScanTaskResponseBodyData self = new CreateJenkinsImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateJenkinsImageScanTaskResponseBodyData setImageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoInstanceId(String repoInstanceId) {
            this.repoInstanceId = repoInstanceId;
            return this;
        }
        public String getRepoInstanceId() {
            return this.repoInstanceId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setRepoRegionId(String repoRegionId) {
            this.repoRegionId = repoRegionId;
            return this;
        }
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateJenkinsImageScanTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
