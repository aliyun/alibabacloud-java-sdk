// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableVersionDetailRequest extends TeaModel {
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
     * <p>Associated variable name.</p>
     * 
     * <strong>example:</strong>
     * <p>dHSi2zf5bb8</p>
     */
    @NameInMap("objectCode")
    public String objectCode;

    /**
     * <p>Associated variable ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3434</p>
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
     * <p>Type.</p>
     * 
     * <strong>example:</strong>
     * <p>VELOCITY</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("version")
    public Long version;

    public static DescribeVariableVersionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableVersionDetailRequest self = new DescribeVariableVersionDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableVersionDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableVersionDetailRequest setObjectCode(String objectCode) {
        this.objectCode = objectCode;
        return this;
    }
    public String getObjectCode() {
        return this.objectCode;
    }

    public DescribeVariableVersionDetailRequest setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }
    public Long getObjectId() {
        return this.objectId;
    }

    public DescribeVariableVersionDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeVariableVersionDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVariableVersionDetailRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
