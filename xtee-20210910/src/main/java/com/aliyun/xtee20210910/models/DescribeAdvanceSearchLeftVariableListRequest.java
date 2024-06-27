// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAdvanceSearchLeftVariableListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scene")
    public String scene;

    public static DescribeAdvanceSearchLeftVariableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvanceSearchLeftVariableListRequest self = new DescribeAdvanceSearchLeftVariableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvanceSearchLeftVariableListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAdvanceSearchLeftVariableListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeAdvanceSearchLeftVariableListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeAdvanceSearchLeftVariableListRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
