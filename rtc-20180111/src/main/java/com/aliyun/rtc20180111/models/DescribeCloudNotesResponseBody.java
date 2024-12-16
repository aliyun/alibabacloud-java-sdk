// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeCloudNotesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>154EF5DE-3D08-1F2C-A482-281F78D74B7C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    public static DescribeCloudNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotesResponseBody self = new DescribeCloudNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotesResponseBody setItems(java.util.List<DescribeCloudNotesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCloudNotesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCloudNotesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCloudNotesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudNotesResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeCloudNotesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/autoChapters_1724914365173.json</p>
         */
        @NameInMap("AutoChaptersFilePath")
        public String autoChaptersFilePath;

        /**
         * <strong>example:</strong>
         * <p>sample-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>testchannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/customPrompt_1724914365173.json</p>
         */
        @NameInMap("CustomPromptFilePath")
        public String customPromptFilePath;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/meetingAssistance_1724914365173.json</p>
         */
        @NameInMap("MeetingAssistanceFilePath")
        public String meetingAssistanceFilePath;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/serviceInspection_1724914365173.json</p>
         */
        @NameInMap("ServiceInspectionFilePath")
        public String serviceInspectionFilePath;

        /**
         * <strong>example:</strong>
         * <p>1731939816837</p>
         */
        @NameInMap("StartTs")
        public Long startTs;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/summarization_1724914365173.json</p>
         */
        @NameInMap("SummarizationFilePath")
        public String summarizationFilePath;

        /**
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/textPolish_1724914365173.json</p>
         */
        @NameInMap("TextPolishFilePath")
        public String textPolishFilePath;

        /**
         * <strong>example:</strong>
         * <p>cloudNote/ksvxxppi/88_12/transcription_1724914365173.json</p>
         */
        @NameInMap("TranscriptionFilePath")
        public String transcriptionFilePath;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static DescribeCloudNotesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudNotesResponseBodyItems self = new DescribeCloudNotesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCloudNotesResponseBodyItems setAutoChaptersFilePath(String autoChaptersFilePath) {
            this.autoChaptersFilePath = autoChaptersFilePath;
            return this;
        }
        public String getAutoChaptersFilePath() {
            return this.autoChaptersFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeCloudNotesResponseBodyItems setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCloudNotesResponseBodyItems setCustomPromptFilePath(String customPromptFilePath) {
            this.customPromptFilePath = customPromptFilePath;
            return this;
        }
        public String getCustomPromptFilePath() {
            return this.customPromptFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setMeetingAssistanceFilePath(String meetingAssistanceFilePath) {
            this.meetingAssistanceFilePath = meetingAssistanceFilePath;
            return this;
        }
        public String getMeetingAssistanceFilePath() {
            return this.meetingAssistanceFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public DescribeCloudNotesResponseBodyItems setServiceInspectionFilePath(String serviceInspectionFilePath) {
            this.serviceInspectionFilePath = serviceInspectionFilePath;
            return this;
        }
        public String getServiceInspectionFilePath() {
            return this.serviceInspectionFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setStartTs(Long startTs) {
            this.startTs = startTs;
            return this;
        }
        public Long getStartTs() {
            return this.startTs;
        }

        public DescribeCloudNotesResponseBodyItems setSummarizationFilePath(String summarizationFilePath) {
            this.summarizationFilePath = summarizationFilePath;
            return this;
        }
        public String getSummarizationFilePath() {
            return this.summarizationFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCloudNotesResponseBodyItems setTextPolishFilePath(String textPolishFilePath) {
            this.textPolishFilePath = textPolishFilePath;
            return this;
        }
        public String getTextPolishFilePath() {
            return this.textPolishFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setTranscriptionFilePath(String transcriptionFilePath) {
            this.transcriptionFilePath = transcriptionFilePath;
            return this;
        }
        public String getTranscriptionFilePath() {
            return this.transcriptionFilePath;
        }

        public DescribeCloudNotesResponseBodyItems setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
