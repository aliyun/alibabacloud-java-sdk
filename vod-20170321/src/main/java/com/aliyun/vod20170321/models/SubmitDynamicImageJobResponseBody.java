// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DynamicImageJob")
    public SubmitDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob;

    /**
     * <p>The parameters used for overriding. The value is a JSON-formatted string. For more information, see the "OverrideParams" section of the [Media processing parameters](~~98618~~) topic. The parameters are used to replace the parameters in the animated image template. For more information, see the [Basic data types](~~52839~~) topic.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDynamicImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponseBody self = new SubmitDynamicImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobResponseBody setDynamicImageJob(SubmitDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob) {
        this.dynamicImageJob = dynamicImageJob;
        return this;
    }
    public SubmitDynamicImageJobResponseBodyDynamicImageJob getDynamicImageJob() {
        return this.dynamicImageJob;
    }

    public SubmitDynamicImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDynamicImageJobResponseBodyDynamicImageJob extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **SubmitDynamicImageJob**.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitDynamicImageJobResponseBodyDynamicImageJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobResponseBodyDynamicImageJob self = new SubmitDynamicImageJobResponseBodyDynamicImageJob();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobResponseBodyDynamicImageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
