// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandsResponseBody extends TeaModel {
    /**
     * <p>The queried commands.</p>
     */
    @NameInMap("Commands")
    public java.util.List<DescribeCommandsResponseBodyCommands> commands;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of commands.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsResponseBody self = new DescribeCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsResponseBody setCommands(java.util.List<DescribeCommandsResponseBodyCommands> commands) {
        this.commands = commands;
        return this;
    }
    public java.util.List<DescribeCommandsResponseBodyCommands> getCommands() {
        return this.commands;
    }

    public DescribeCommandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommandsResponseBodyCommandsParameterDefinitions extends TeaModel {
        /**
         * <p>The default value of the custom parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun-client-assist.oss-accelerate.aliyuncs.com/linux/aliyun_assist_latest.rpm">https://aliyun-client-assist.oss-accelerate.aliyuncs.com/linux/aliyun_assist_latest.rpm</a></p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the custom parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Command Assistant Agent Installation Package Path</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the custom parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DownloadUrl</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The valid values of the custom parameter.</p>
         */
        @NameInMap("PossibleValues")
        public java.util.List<String> possibleValues;

        /**
         * <p>Indicates whether the custom parameter is required. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Required")
        public Boolean required;

        public static DescribeCommandsResponseBodyCommandsParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsParameterDefinitions self = new DescribeCommandsResponseBodyCommandsParameterDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setPossibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public java.util.List<String> getPossibleValues() {
            return this.possibleValues;
        }

        public DescribeCommandsResponseBodyCommandsParameterDefinitions setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class DescribeCommandsResponseBodyCommandsTags extends TeaModel {
        /**
         * <p>The tag key of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCommandsResponseBodyCommandsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommandsTags self = new DescribeCommandsResponseBodyCommandsTags();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommandsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCommandsResponseBodyCommandsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCommandsResponseBodyCommands extends TeaModel {
        /**
         * <p>The content of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>cat /etc/ssh/sshd_config</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-gov1k1tqwi9****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The time when the command was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05T06:38:53Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the custom parameter feature is enabled for the command.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableParameter")
        public Boolean enableParameter;

        /**
         * <p>The name of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Details of the custom parameter.</p>
         */
        @NameInMap("ParameterDefinitions")
        public java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> parameterDefinitions;

        /**
         * <p>The custom parameter names that are parsed from the command content specified when the command was created. The custom parameter names are returned in the list format. If the custom parameter feature is disabled, an empty list is returned.</p>
         */
        @NameInMap("ParameterNames")
        public java.util.List<String> parameterNames;

        /**
         * <p>The provider of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bti7cf7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags that are bound to the command.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeCommandsResponseBodyCommandsTags> tags;

        /**
         * <p>The timeout period of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The type of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The execution path of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeCommandsResponseBodyCommands build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsResponseBodyCommands self = new DescribeCommandsResponseBodyCommands();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsResponseBodyCommands setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeCommandsResponseBodyCommands setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeCommandsResponseBodyCommands setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCommandsResponseBodyCommands setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommandsResponseBodyCommands setEnableParameter(Boolean enableParameter) {
            this.enableParameter = enableParameter;
            return this;
        }
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        public DescribeCommandsResponseBodyCommands setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommandsResponseBodyCommands setParameterDefinitions(java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public DescribeCommandsResponseBodyCommands setParameterNames(java.util.List<String> parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public java.util.List<String> getParameterNames() {
            return this.parameterNames;
        }

        public DescribeCommandsResponseBodyCommands setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeCommandsResponseBodyCommands setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCommandsResponseBodyCommands setTags(java.util.List<DescribeCommandsResponseBodyCommandsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCommandsResponseBodyCommandsTags> getTags() {
            return this.tags;
        }

        public DescribeCommandsResponseBodyCommands setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeCommandsResponseBodyCommands setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCommandsResponseBodyCommands setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

}
