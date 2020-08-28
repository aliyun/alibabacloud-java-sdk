// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TranscodeTaskList")
    @Validation(required = true)
    public java.util.List<ListTranscodeTaskResponseTranscodeTaskList> transcodeTaskList;

    public static ListTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTaskResponse self = new ListTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTranscodeTaskResponseTranscodeTaskList extends TeaModel {
        @NameInMap("TranscodeTaskId")
        @Validation(required = true)
        public String transcodeTaskId;

        @NameInMap("VideoId")
        @Validation(required = true)
        public String videoId;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("TranscodeTemplateGroupId")
        @Validation(required = true)
        public String transcodeTemplateGroupId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CompleteTime")
        @Validation(required = true)
        public String completeTime;

        @NameInMap("Trigger")
        @Validation(required = true)
        public String trigger;

        public static ListTranscodeTaskResponseTranscodeTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListTranscodeTaskResponseTranscodeTaskList self = new ListTranscodeTaskResponseTranscodeTaskList();
            return TeaModel.build(map, self);
        }

    }

}
