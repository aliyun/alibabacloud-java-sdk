// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("filterDTO")
    public String filterDTO;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refObjId")
    public String refObjId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refObjType")
    public String refObjType;

    @NameInMap("regId")
    public String regId;

    @NameInMap("type")
    public String type;

    public static DescribeEventVariableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventVariableListRequest self = new DescribeEventVariableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventVariableListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventVariableListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeEventVariableListRequest setFilterDTO(String filterDTO) {
        this.filterDTO = filterDTO;
        return this;
    }
    public String getFilterDTO() {
        return this.filterDTO;
    }

    public DescribeEventVariableListRequest setRefObjId(String refObjId) {
        this.refObjId = refObjId;
        return this;
    }
    public String getRefObjId() {
        return this.refObjId;
    }

    public DescribeEventVariableListRequest setRefObjType(String refObjType) {
        this.refObjType = refObjType;
        return this;
    }
    public String getRefObjType() {
        return this.refObjType;
    }

    public DescribeEventVariableListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventVariableListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
