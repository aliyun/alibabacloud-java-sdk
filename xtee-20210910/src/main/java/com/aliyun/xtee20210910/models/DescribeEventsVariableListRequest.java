// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventsVariableListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Filter object</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;:\&quot;EXPRESSION\&quot;,\&quot;name\&quot;:\&quot;ex_NgR6nDVD821c\&quot;}</p>
     */
    @NameInMap("filterDTO")
    public String filterDTO;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Applicable scene code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VELOCITY</p>
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
