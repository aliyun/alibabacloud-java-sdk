// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class GetChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QuestionAndAnswer</p>
     */
    @NameInMap("Verbose")
    public String verbose;

    public static GetChatRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatRequest self = new GetChatRequest();
        return TeaModel.build(map, self);
    }

    public GetChatRequest setVerbose(String verbose) {
        this.verbose = verbose;
        return this;
    }
    public String getVerbose() {
        return this.verbose;
    }

}
