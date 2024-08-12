// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTrustDevicesRequest extends TeaModel {
    @NameInMap("LabelContent")
    public String labelContent;

    @NameInMap("LabelId")
    public String labelId;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("UserCustomId")
    public String userCustomId;

    public static ListTrustDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrustDevicesRequest self = new ListTrustDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListTrustDevicesRequest setLabelContent(String labelContent) {
        this.labelContent = labelContent;
        return this;
    }
    public String getLabelContent() {
        return this.labelContent;
    }

    public ListTrustDevicesRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public ListTrustDevicesRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public ListTrustDevicesRequest setUserCustomId(String userCustomId) {
        this.userCustomId = userCustomId;
        return this;
    }
    public String getUserCustomId() {
        return this.userCustomId;
    }

}
