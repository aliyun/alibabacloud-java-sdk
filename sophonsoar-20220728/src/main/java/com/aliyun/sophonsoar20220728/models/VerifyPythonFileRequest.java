// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPythonFileRequest extends TeaModel {
    /**
     * <p>The Python code snippet.</p>
     */
    @NameInMap("Content")
    public String content;

    public static VerifyPythonFileRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPythonFileRequest self = new VerifyPythonFileRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPythonFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
