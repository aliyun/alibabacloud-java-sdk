// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCSystemSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Switches")
    public String switches;

    public static ListLDCSystemSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCSystemSwitchResponseBody self = new ListLDCSystemSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCSystemSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCSystemSwitchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCSystemSwitchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCSystemSwitchResponseBody setSwitches(String switches) {
        this.switches = switches;
        return this;
    }
    public String getSwitches() {
        return this.switches;
    }

}
