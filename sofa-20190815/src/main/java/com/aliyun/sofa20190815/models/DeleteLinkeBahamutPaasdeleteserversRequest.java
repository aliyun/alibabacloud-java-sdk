// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutPaasdeleteserversRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("ServersRepeatList")
    public java.util.List<String> serversRepeatList;

    public static DeleteLinkeBahamutPaasdeleteserversRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutPaasdeleteserversRequest self = new DeleteLinkeBahamutPaasdeleteserversRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutPaasdeleteserversRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public DeleteLinkeBahamutPaasdeleteserversRequest setServersRepeatList(java.util.List<String> serversRepeatList) {
        this.serversRepeatList = serversRepeatList;
        return this;
    }
    public java.util.List<String> getServersRepeatList() {
        return this.serversRepeatList;
    }

}
