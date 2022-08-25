// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailResponseBody extends TeaModel {
    @NameInMap("LabelSelectorKey")
    public String labelSelectorKey;

    @NameInMap("LabelSelectorValue")
    public String labelSelectorValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServicesList")
    public java.util.List<byte[]> servicesList;

    public static GetSwimLaneDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneDetailResponseBody self = new GetSwimLaneDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneDetailResponseBody setLabelSelectorKey(String labelSelectorKey) {
        this.labelSelectorKey = labelSelectorKey;
        return this;
    }
    public String getLabelSelectorKey() {
        return this.labelSelectorKey;
    }

    public GetSwimLaneDetailResponseBody setLabelSelectorValue(String labelSelectorValue) {
        this.labelSelectorValue = labelSelectorValue;
        return this;
    }
    public String getLabelSelectorValue() {
        return this.labelSelectorValue;
    }

    public GetSwimLaneDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneDetailResponseBody setServicesList(java.util.List<byte[]> servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public java.util.List<byte[]> getServicesList() {
        return this.servicesList;
    }

}
