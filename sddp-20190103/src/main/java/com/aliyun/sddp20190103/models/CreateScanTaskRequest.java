// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the data asset such as an instance, database, or bucket. You can call <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> to obtain the ID.</p>
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
     * <p>The interval in days between two consecutive custom scan tasks. Valid values: 1 to 2147483648.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IntervalDay")
    public Integer intervalDay;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The scan scope for OSS assets. Prefix match, suffix match, and regular expression match are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/test</p>
     */
    @NameInMap("OssScanPath")
    public String ossScanPath;

    /**
     * <p>The resource type of the product to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute.</li>
     * <li><strong>2</strong>: OSS.</li>
     * <li><strong>3</strong>: ADS.</li>
     * <li><strong>4</strong>: OTS.</li>
     * <li><strong>5</strong>: RDS.</li>
     * <li><strong>6</strong>: SELF_DB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The runtime of the next scan task. Unit: hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RunHour")
    public Integer runHour;

    /**
     * <p>The runtime of the next scan task. Unit: minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RunMinute")
    public Integer runMinute;

    /**
     * <p>The scan scope matching rule for the custom scan task. This parameter takes effect only when used together with <strong>ScanRangeContent</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: full match.</li>
     * <li><strong>1</strong>: prefix match.</li>
     * <li><strong>2</strong>: suffix match.</li>
     * <li><strong>3</strong>: regular expression match.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScanRange")
    public Integer scanRange;

    /**
     * <p>The content to match within the scan scope of structured data assets by using prefix match, suffix match, or regular expression match.</p>
     * <blockquote>
     * <p>When ScanRange is set to 0, all content in this field is fully matched. When ScanRange is set to 1, the content in this field is matched by prefix. For example, if this field is set to test/abc, file paths that start with test/abc are matched. When ScanRange is set to 2, the content in this field is matched by suffix. When ScanRange is set to 3, the content in this field is matched by regular expression.</p>
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
