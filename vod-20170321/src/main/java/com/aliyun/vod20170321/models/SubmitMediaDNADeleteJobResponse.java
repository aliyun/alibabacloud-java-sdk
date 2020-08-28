// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaDNADeleteJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static SubmitMediaDNADeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaDNADeleteJobResponse self = new SubmitMediaDNADeleteJobResponse();
        return TeaModel.build(map, self);
    }

}
