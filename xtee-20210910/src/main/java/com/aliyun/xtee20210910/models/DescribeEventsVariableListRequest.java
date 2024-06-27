// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventsVariableListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("filterDTO")
    public String filterDTO;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scene")
    public String scene;

    public static DescribeEventsVariableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsVariableListRequest self = new DescribeEventsVariableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsVariableListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventsVariableListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeEventsVariableListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeEventsVariableListRequest setFilterDTO(String filterDTO) {
        this.filterDTO = filterDTO;
        return this;
    }
    public String getFilterDTO() {
        return this.filterDTO;
    }

    public DescribeEventsVariableListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventsVariableListRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
