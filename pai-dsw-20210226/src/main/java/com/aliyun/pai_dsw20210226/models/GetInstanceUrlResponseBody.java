// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceUrlResponseBody extends TeaModel {
    // webide的链接
    @NameInMap("Ide")
    public String ide;

    // jupyterlab的链接
    @NameInMap("Lab")
    public String lab;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // terminal终端的链接
    @NameInMap("Terminal")
    public String terminal;

    public static GetInstanceUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUrlResponseBody self = new GetInstanceUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceUrlResponseBody setIde(String ide) {
        this.ide = ide;
        return this;
    }
    public String getIde() {
        return this.ide;
    }

    public GetInstanceUrlResponseBody setLab(String lab) {
        this.lab = lab;
        return this;
    }
    public String getLab() {
        return this.lab;
    }

    public GetInstanceUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceUrlResponseBody setTerminal(String terminal) {
        this.terminal = terminal;
        return this;
    }
    public String getTerminal() {
        return this.terminal;
    }

}
