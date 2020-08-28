// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DynamicImageJob")
    @Validation(required = true)
    public SubmitDynamicImageJobResponseDynamicImageJob dynamicImageJob;

    public static SubmitDynamicImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponse self = new SubmitDynamicImageJobResponse();
        return TeaModel.build(map, self);
    }

    public static class SubmitDynamicImageJobResponseDynamicImageJob extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        public static SubmitDynamicImageJobResponseDynamicImageJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobResponseDynamicImageJob self = new SubmitDynamicImageJobResponseDynamicImageJob();
            return TeaModel.build(map, self);
        }

    }

}
