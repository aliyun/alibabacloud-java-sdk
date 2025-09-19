// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventVariableListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. The values are: - <strong>zh</strong>: Chinese - <strong>en</strong>: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Create Type.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <p>Filter object.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;type&quot;: &quot;EXPRESSION&quot;,
     *     &quot;name&quot;: &quot;ex_NgR6nDVD821c&quot;
     * }</p>
     */
    @NameInMap("filterDTO")
    public String filterDTO;

    /**
     * <p>Associated event eventCode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_awkhwh0314</p>
     */
    @NameInMap("refObjId")
    public String refObjId;

    /**
     * <p>Association Type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EVENT</p>
     */
    @NameInMap("refObjType")
    public String refObjType;

    /**
     * <p>Region Code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>type.</p>
     * 
     * <strong>example:</strong>
     * <p>NATIVE</p>
     */
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
