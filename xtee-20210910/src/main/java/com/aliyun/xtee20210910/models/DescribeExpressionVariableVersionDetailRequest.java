// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableVersionDetailRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Associated variable code.</p>
     * 
     * <strong>example:</strong>
     * <p>ex_0kWIfZ27c525</p>
     */
    @NameInMap("objectCode")
    public String objectCode;

    /**
     * <p>Associated variable primary key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>397625</p>
     */
    @NameInMap("objectId")
    public Long objectId;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Variable type.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPRESSION</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Version number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("version")
    public Long version;

    public static DescribeExpressionVariableVersionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableVersionDetailRequest self = new DescribeExpressionVariableVersionDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableVersionDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExpressionVariableVersionDetailRequest setObjectCode(String objectCode) {
        this.objectCode = objectCode;
        return this;
    }
    public String getObjectCode() {
        return this.objectCode;
    }

    public DescribeExpressionVariableVersionDetailRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DescribeExpressionVariableVersionDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeExpressionVariableVersionDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeExpressionVariableVersionDetailRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
