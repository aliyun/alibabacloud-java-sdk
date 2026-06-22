// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulNumStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of application vulnerability entries detected by the scanner on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppCnt")
    public Integer appCnt;

    /**
     * <p>The number of application vulnerabilities detected by the scanner on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppNum")
    public Integer appNum;

    /**
     * <p>The total number of handled CMS vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CmsDealedTotalNum")
    public Integer cmsDealedTotalNum;

    /**
     * <p>The number of Web-CMS vulnerabilities on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CmsNum")
    public Integer cmsNum;

    /**
     * <p>The number of Linux software vulnerabilities on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CveNum")
    public Integer cveNum;

    /**
     * <p>The number of urgent vulnerabilities on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EmgNum")
    public Integer emgNum;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E22C89D2-FE13-5800-8746-9D0EF1827A59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of middleware vulnerabilities on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScaNum")
    public Integer scaNum;

    /**
     * <p>The number of Windows system vulnerabilities on your assets.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SysNum")
    public Integer sysNum;

    /**
     * <p>The number of vulnerabilities with a high fix priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulAsapSum")
    public Integer vulAsapSum;

    /**
     * <p>This field is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulDealedTotalNum")
    public Integer vulDealedTotalNum;

    /**
     * <p>The number of vulnerabilities with a medium fix priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulLaterSum")
    public Integer vulLaterSum;

    /**
     * <p>The number of vulnerabilities with a low fix priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VulNntfSum")
    public Integer vulNntfSum;

    public static DescribeVulNumStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulNumStatisticsResponseBody self = new DescribeVulNumStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulNumStatisticsResponseBody setAppCnt(Integer appCnt) {
        this.appCnt = appCnt;
        return this;
    }
    public Integer getAppCnt() {
        return this.appCnt;
    }

    public DescribeVulNumStatisticsResponseBody setAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }
    public Integer getAppNum() {
        return this.appNum;
    }

    public DescribeVulNumStatisticsResponseBody setCmsDealedTotalNum(Integer cmsDealedTotalNum) {
        this.cmsDealedTotalNum = cmsDealedTotalNum;
        return this;
    }
    public Integer getCmsDealedTotalNum() {
        return this.cmsDealedTotalNum;
    }

    public DescribeVulNumStatisticsResponseBody setCmsNum(Integer cmsNum) {
        this.cmsNum = cmsNum;
        return this;
    }
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    public DescribeVulNumStatisticsResponseBody setCveNum(Integer cveNum) {
        this.cveNum = cveNum;
        return this;
    }
    public Integer getCveNum() {
        return this.cveNum;
    }

    public DescribeVulNumStatisticsResponseBody setEmgNum(Integer emgNum) {
        this.emgNum = emgNum;
        return this;
    }
    public Integer getEmgNum() {
        return this.emgNum;
    }

    public DescribeVulNumStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulNumStatisticsResponseBody setScaNum(Integer scaNum) {
        this.scaNum = scaNum;
        return this;
    }
    public Integer getScaNum() {
        return this.scaNum;
    }

    public DescribeVulNumStatisticsResponseBody setSysNum(Integer sysNum) {
        this.sysNum = sysNum;
        return this;
    }
    public Integer getSysNum() {
        return this.sysNum;
    }

    public DescribeVulNumStatisticsResponseBody setVulAsapSum(Integer vulAsapSum) {
        this.vulAsapSum = vulAsapSum;
        return this;
    }
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    public DescribeVulNumStatisticsResponseBody setVulDealedTotalNum(Integer vulDealedTotalNum) {
        this.vulDealedTotalNum = vulDealedTotalNum;
        return this;
    }
    public Integer getVulDealedTotalNum() {
        return this.vulDealedTotalNum;
    }

    public DescribeVulNumStatisticsResponseBody setVulLaterSum(Integer vulLaterSum) {
        this.vulLaterSum = vulLaterSum;
        return this;
    }
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    public DescribeVulNumStatisticsResponseBody setVulNntfSum(Integer vulNntfSum) {
        this.vulNntfSum = vulNntfSum;
        return this;
    }
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

}
