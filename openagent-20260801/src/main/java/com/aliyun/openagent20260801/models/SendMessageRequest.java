// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <p>The message text in MESSAGE mode. This parameter cannot be empty. The type can be omitted in this mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Query the status of the sample resource without making any changes</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The list of interrupt replies. This parameter is required when <code>type</code> is set to <code>RESUME</code>. You must reply to all pending interrupts at once, and each <code>interruptId</code> can appear only once.</p>
     */
    @NameInMap("resume")
    public java.util.List<SendMessageRequestResume> resume;

    /**
     * <p>The ID of the active run to resubscribe to. This parameter is required in RECONNECT mode.</p>
     * 
     * <strong>example:</strong>
     * <p>run_example_001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The request type. Valid values: <code>MESSAGE</code> (sends a message), <code>RESUME</code> (resumes a run), and <code>RECONNECT</code> (reconnects to a run). Default value: <code>MESSAGE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>MESSAGE</p>
     */
    @NameInMap("type")
    public String type;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendMessageRequest setResume(java.util.List<SendMessageRequestResume> resume) {
        this.resume = resume;
        return this;
    }
    public java.util.List<SendMessageRequestResume> getResume() {
        return this.resume;
    }

    public SendMessageRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public SendMessageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class SendMessageRequestResume extends TeaModel {
        /**
         * <p>The ID of the interrupt to be replied to. Obtain this value from <code>data.outcome.interrupts[].id</code> in the SSE <code>RUN_FINISHED</code> event or <code>data.outcome.interrupts[].id</code> in the <code>GetRun</code> response.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt_example_001</p>
         */
        @NameInMap("interruptId")
        public String interruptId;

        /**
         * <p>The interrupt handling result. This parameter is required when <code>status</code> is set to <code>resolved</code> and must conform to the <code>responseSchema</code> of the corresponding interrupt. Do not pass this parameter when <code>status</code> is set to <code>cancelled</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("payload")
        public Object payload;

        /**
         * <p>The reply method for the current interrupt. <code>resolved</code> indicates that the answer, confirmation, or tool result required by the interrupt is submitted, and <code>payload</code> must be provided. <code>cancelled</code> indicates that the interrupt is canceled, and <code>payload</code> is not passed.</p>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("status")
        public String status;

        public static SendMessageRequestResume build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestResume self = new SendMessageRequestResume();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestResume setInterruptId(String interruptId) {
            this.interruptId = interruptId;
            return this;
        }
        public String getInterruptId() {
            return this.interruptId;
        }

        public SendMessageRequestResume setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
        public Object getPayload() {
            return this.payload;
        }

        public SendMessageRequestResume setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
