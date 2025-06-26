// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetAudioAsrTaskStatusResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetAudioAsrTaskStatusResponseBodyResult result;

    @NameInMap("usage")
    public GetAudioAsrTaskStatusResponseBodyUsage usage;

    public static GetAudioAsrTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsrTaskStatusResponseBody self = new GetAudioAsrTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioAsrTaskStatusResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetAudioAsrTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioAsrTaskStatusResponseBody setResult(GetAudioAsrTaskStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAudioAsrTaskStatusResponseBodyResult getResult() {
        return this.result;
    }

    public GetAudioAsrTaskStatusResponseBody setUsage(GetAudioAsrTaskStatusResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetAudioAsrTaskStatusResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetAudioAsrTaskStatusResponseBodyResultData extends TeaModel {
        @NameInMap("end")
        public Float end;

        @NameInMap("start")
        public Float start;

        @NameInMap("text")
        public String text;

        public static GetAudioAsrTaskStatusResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioAsrTaskStatusResponseBodyResultData self = new GetAudioAsrTaskStatusResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetAudioAsrTaskStatusResponseBodyResultData setEnd(Float end) {
            this.end = end;
            return this;
        }
        public Float getEnd() {
            return this.end;
        }

        public GetAudioAsrTaskStatusResponseBodyResultData setStart(Float start) {
            this.start = start;
            return this;
        }
        public Float getStart() {
            return this.start;
        }

        public GetAudioAsrTaskStatusResponseBodyResultData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetAudioAsrTaskStatusResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetAudioAsrTaskStatusResponseBodyResultData> data;

        @NameInMap("error")
        public String error;

        @NameInMap("status")
        public String status;

        @NameInMap("task_id")
        public String taskId;

        public static GetAudioAsrTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAudioAsrTaskStatusResponseBodyResult self = new GetAudioAsrTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAudioAsrTaskStatusResponseBodyResult setData(java.util.List<GetAudioAsrTaskStatusResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetAudioAsrTaskStatusResponseBodyResultData> getData() {
            return this.data;
        }

        public GetAudioAsrTaskStatusResponseBodyResult setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetAudioAsrTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAudioAsrTaskStatusResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetAudioAsrTaskStatusResponseBodyUsage extends TeaModel {
        @NameInMap("duration")
        public Float duration;

        public static GetAudioAsrTaskStatusResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetAudioAsrTaskStatusResponseBodyUsage self = new GetAudioAsrTaskStatusResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetAudioAsrTaskStatusResponseBodyUsage setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

    }

}
