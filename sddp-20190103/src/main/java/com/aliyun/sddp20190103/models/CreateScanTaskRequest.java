// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the data asset. The asset can be an instance, a database, or a bucket. Call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataLimitId")
    public Long dataLimitId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The interval in days between two consecutive custom scan tasks. The value must be between 1 and 2147483648.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IntervalDay")
    public Integer intervalDay;

    /**
     * <p>The language of the request and response.</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The scan scope for OSS assets. You can specify a prefix, a suffix, or a regular expression to match objects.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/test</p>
     */
    @NameInMap("OssScanPath")
    public String ossScanPath;

    /**
     * <p>The type of resource to query. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute.</p>
     * </li>
     * <li><p><strong>2</strong>: OSS.</p>
     * </li>
     * <li><p><strong>3</strong>: AnalyticDB.</p>
     * </li>
     * <li><p><strong>4</strong>: Tablestore.</p>
     * </li>
     * <li><p><strong>5</strong>: RDS.</p>
     * </li>
     * <li><p><strong>6</strong>: a self-managed database.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The hour at which the next scan task runs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RunHour")
    public Integer runHour;

    /**
     * <p>The minute at which the next scan task runs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RunMinute")
    public Integer runMinute;

    /**
     * <p>The matching rule for the scan scope of the custom scan task. This parameter takes effect only when you configure the <strong>ScanRangeContent</strong> parameter. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: full match.</p>
     * </li>
     * <li><p><strong>1</strong>: prefix match.</p>
     * </li>
     * <li><p><strong>2</strong>: suffix match.</p>
     * </li>
     * <li><p><strong>3</strong>: regular expression match.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScanRange")
    public Integer scanRange;

    /**
     * <p>The content to match for the scan of structured data assets. This parameter is used with the ScanRange parameter.</p>
     * <blockquote>
     * <p>If you set ScanRange to 0, the scan matches the exact value of this parameter. If you set ScanRange to 1, the scan matches items that have the prefix specified by this parameter. For example, if you set this parameter to \<code>test/abc\\</code>, file paths that start with \<code>test/abc\\</code> are matched. If you set ScanRange to 2, the scan matches items that have the suffix specified by this parameter. If you set ScanRange to 3, the scan matches items that match the regular expression specified by this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datamask/</p>
     */
    @NameInMap("ScanRangeContent")
    public String scanRangeContent;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The name of the scan task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan-test-sample****</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The account that creates the scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TaskUserName")
    public String taskUserName;

    public static CreateScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanTaskRequest self = new CreateScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanTaskRequest setDataLimitId(Long dataLimitId) {
        this.dataLimitId = dataLimitId;
        return this;
    }
    public Long getDataLimitId() {
        return this.dataLimitId;
    }

    public CreateScanTaskRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public CreateScanTaskRequest setIntervalDay(Integer intervalDay) {
        this.intervalDay = intervalDay;
        return this;
    }
    public Integer getIntervalDay() {
        return this.intervalDay;
    }

    public CreateScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateScanTaskRequest setOssScanPath(String ossScanPath) {
        this.ossScanPath = ossScanPath;
        return this;
    }
    public String getOssScanPath() {
        return this.ossScanPath;
    }

    public CreateScanTaskRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public CreateScanTaskRequest setRunHour(Integer runHour) {
        this.runHour = runHour;
        return this;
    }
    public Integer getRunHour() {
        return this.runHour;
    }

    public CreateScanTaskRequest setRunMinute(Integer runMinute) {
        this.runMinute = runMinute;
        return this;
    }
    public Integer getRunMinute() {
        return this.runMinute;
    }

    public CreateScanTaskRequest setScanRange(Integer scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public Integer getScanRange() {
        return this.scanRange;
    }

    public CreateScanTaskRequest setScanRangeContent(String scanRangeContent) {
        this.scanRangeContent = scanRangeContent;
        return this;
    }
    public String getScanRangeContent() {
        return this.scanRangeContent;
    }

    public CreateScanTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateScanTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScanTaskRequest setTaskUserName(String taskUserName) {
        this.taskUserName = taskUserName;
        return this;
    }
    public String getTaskUserName() {
        return this.taskUserName;
    }

}
