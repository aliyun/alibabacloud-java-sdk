// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the data asset, such as an instance, a database, and a bucket. You can call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to query the unique ID.</p>
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
     * <p>The interval between two consecutive custom scan tasks. Unit: days. Valid values: 1 to 2147483648.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IntervalDay")
    public Integer intervalDay;

    /**
     * <p>The language of the content within the request and response.</p>
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
     * <p>The data to be scanned in the Object Storage Service (OSS) bucket. Prefix match, suffix match, and regular expression match are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/test</p>
     */
    @NameInMap("OssScanPath")
    public String ossScanPath;

    /**
     * <p>The type of the service to which the data assets to be scanned belong. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The time when the scan task is executed next time. Unit: hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RunHour")
    public Integer runHour;

    /**
     * <p>The time when the scan task is executed next time. Unit: minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RunMinute")
    public Integer runMinute;

    /**
     * <p>The matching rule that specifies the scan scope of the custom scan task. This parameter takes effect only if you set the <strong>ScanRangeContent</strong> parameter. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: exact match</li>
     * <li><strong>1</strong>: prefix match</li>
     * <li><strong>2</strong>: suffix match</li>
     * <li><strong>3</strong>: regular expression match</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScanRange")
    public Integer scanRange;

    /**
     * <p>The data to be scanned in a structured data asset. Prefix match, suffix match, and regular expression match are supported.</p>
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
     * <p>39.170.XX.XX</p>
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
     * <p>The account that is used to create the scan task.</p>
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
