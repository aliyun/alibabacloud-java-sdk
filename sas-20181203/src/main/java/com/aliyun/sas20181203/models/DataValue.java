// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CveNum")
    public Integer cveNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EmgNum")
    public Integer emgNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SysNum")
    public Integer sysNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CmsNum")
    public Integer cmsNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppNum")
    public Integer appNum;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaNum")
    public Integer scaNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulAsapSum")
    public Integer vulAsapSum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulLaterSum")
    public Integer vulLaterSum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulNntfSum")
    public Integer vulNntfSum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SysAsapNum")
    public Integer sysAsapNum;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setCveNum(Integer cveNum) {
        this.cveNum = cveNum;
        return this;
    }
    public Integer getCveNum() {
        return this.cveNum;
    }

    public DataValue setEmgNum(Integer emgNum) {
        this.emgNum = emgNum;
        return this;
    }
    public Integer getEmgNum() {
        return this.emgNum;
    }

    public DataValue setSysNum(Integer sysNum) {
        this.sysNum = sysNum;
        return this;
    }
    public Integer getSysNum() {
        return this.sysNum;
    }

    public DataValue setCmsNum(Integer cmsNum) {
        this.cmsNum = cmsNum;
        return this;
    }
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    public DataValue setAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }
    public Integer getAppNum() {
        return this.appNum;
    }

    public DataValue setScaNum(Integer scaNum) {
        this.scaNum = scaNum;
        return this;
    }
    public Integer getScaNum() {
        return this.scaNum;
    }

    public DataValue setVulAsapSum(Integer vulAsapSum) {
        this.vulAsapSum = vulAsapSum;
        return this;
    }
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    public DataValue setVulLaterSum(Integer vulLaterSum) {
        this.vulLaterSum = vulLaterSum;
        return this;
    }
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    public DataValue setVulNntfSum(Integer vulNntfSum) {
        this.vulNntfSum = vulNntfSum;
        return this;
    }
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    public DataValue setSysAsapNum(Integer sysAsapNum) {
        this.sysAsapNum = sysAsapNum;
        return this;
    }
    public Integer getSysAsapNum() {
        return this.sysAsapNum;
    }

}
