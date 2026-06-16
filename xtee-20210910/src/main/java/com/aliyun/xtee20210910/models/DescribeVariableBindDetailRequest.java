// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableBindDetailRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the bound variable definition.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("defineId")
    public Long defineId;

    /**
     * <p>The primary key ID of the variable. Leave this parameter empty for new entries.</p>
     * 
     * <strong>example:</strong>
     * <p>3144</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The region code.</p>
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
