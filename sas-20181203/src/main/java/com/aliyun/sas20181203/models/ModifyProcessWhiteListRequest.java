// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyProcessWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The MD5 hash value of the process startup file.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListProcess~~">DescribeWhiteListProcess</a> operation to obtain the MD5 hash value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>001d7f68c3b44147988f0dc81192****</p>
     */
    @NameInMap("Md5s")
    public String md5s;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>173.128.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The whitelist status of the process. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: removes a process from the whitelist.</li>
     * <li><strong>2</strong>: adds a process to the whitelist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeWhiteListStrategyList~~">DescribeWhiteListStrategyList</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static ModifyProcessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessWhiteListRequest self = new ModifyProcessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProcessWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyProcessWhiteListRequest setMd5s(String md5s) {
        this.md5s = md5s;
        return this;
    }
    public String getMd5s() {
        return this.md5s;
    }

    public ModifyProcessWhiteListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyProcessWhiteListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModifyProcessWhiteListRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
