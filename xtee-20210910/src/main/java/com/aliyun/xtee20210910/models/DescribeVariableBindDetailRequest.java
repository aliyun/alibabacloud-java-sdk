// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableBindDetailRequest extends TeaModel {
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
     * <p>Bound variable definition ID</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("defineId")
    public Long defineId;

    /**
     * <p>Primary key ID of the variable, which is empty if it\&quot;s a new addition</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeVariableBindDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableBindDetailRequest self = new DescribeVariableBindDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableBindDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableBindDetailRequest setDefineId(Long defineId) {
        this.defineId = defineId;
        return this;
    }
    public Long getDefineId() {
        return this.defineId;
    }

    public DescribeVariableBindDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeVariableBindDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
